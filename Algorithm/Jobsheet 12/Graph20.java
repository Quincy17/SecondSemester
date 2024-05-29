public class Graph20{
    int vertex;
    DoubleLinkedLists20 list[];

    public Graph20(int v){
        vertex = v;
        list = new DoubleLinkedLists20[v];
        for(int i=0;i<v;i++){
            list[i] = new DoubleLinkedLists20();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
        list[tujuan].addFirst(asal, jarak);
    }
    public void degree(int asal) throws Exception{
        int k, totalIn=0, totalOut=0;
        for(int i=0;i<vertex;i++){
            //inDegree
            for(int j=0;j<list[i].size();j++){
                if(list[i].get(j) == asal){
                    ++totalIn;
                }
            }
            //outDegree
            for(k=0;k<list[asal].size();k++){
                list[asal].get(k);
            }
            totalOut=k;
        }
        System.out.println("InDegree dari Gedung " +(char) ('A' +asal) + ":" +totalIn);
        System.out.println("OutDegree dari Gedung " +(char) ('A' +asal) + ":" +totalOut);
        System.out.println("Degree dari Gedung " +(char) ('A' +asal) + ":" +(totalIn+totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
        list[tujuan].remove(asal);
    }


    public void removeAllEdge(){
        for(int i=0;i<vertex;i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " Terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public boolean isPathExist(int asal, int tujuan) {
        boolean[] visited = new boolean[vertex];
        return dfs(asal, tujuan, visited);
    }

    public boolean dfs(int current, int target, boolean[] visited) {
        if (current == target) {
            return true;
        }
        visited[current] = true;
        for (int i = 0; i < list[current].size(); i++) {
            int neighbor;
            try {
                neighbor = list[current].get(i);
                if (!visited[neighbor] && dfs(neighbor, target, visited)) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean isDirectlyConnected(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].setJarak(i, jarakBaru);
                break;
            }
        }
        for (int i = 0; i < list[tujuan].size(); i++) {
            if (list[tujuan].get(i) == asal) {
                list[tujuan].setJarak(i, jarakBaru);
                break;
            }
        }
        System.out.println("Jarak antara Gedung " + (char)('A' + asal) + " dan Gedung " + (char)('A' + tujuan) + " berhasil diperbarui menjadi " + jarakBaru + " m.");
    }

    public int hitungEdge() {
        int jumlahEdge = 0;
        for (int i = 0; i < vertex; i++) {
            jumlahEdge += list[i].size();
        }
        // Karena setiap edge terhitung dua kali (asal ke tujuan dan tujuan ke asal), maka dibagi 2
        return jumlahEdge / 2;
    }
}