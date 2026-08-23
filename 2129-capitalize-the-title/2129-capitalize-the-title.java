class Solution {
    public String capitalizeTitle(String title) {
        String ans="";
        String sp[] = title.split(" ");
        for(String str : sp){ 
            str=str.toLowerCase();       
            char[] stArr = str.toCharArray();
            if(stArr.length > 2){
                stArr[0]=Character.toUpperCase(stArr[0]);
            }
            str = new String(stArr);
            ans=ans+str+" ";
        }
        return ans.trim();
    }
}