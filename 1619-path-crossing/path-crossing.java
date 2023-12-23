import java.util.*;
class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        char[] arr = (path.toCharArray());
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");
        for(int i=0;i< arr.length;i++){
            if(arr[i]=='N'){
                y++;
            }
            if(arr[i]=='S'){
                y--;
            }
            if(arr[i]=='E'){
                x++;
            }
            if(arr[i]=='W'){
                x--;
            }
            String currentpos = x+","+y;
            if(visited.contains(currentpos)){
                return true;
            }
            visited.add(currentpos);
        }
        return false;
    }
}