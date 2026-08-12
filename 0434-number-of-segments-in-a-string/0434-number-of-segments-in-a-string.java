class Solution {
    public int countSegments(String s) {
        String str=s.trim();
        if(str.isEmpty()) return 0;
        String[] result = str.split("\\s+");
        return result.length;
    }
}