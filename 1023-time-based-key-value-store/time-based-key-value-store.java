class TimeMap {
     HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {

        

        if(!map.containsKey(key)){
            map.put(key, new TreeMap<>());
        }
        TreeMap<Integer, String> neew = map.get(key);
        neew.put(timestamp, value);
        


        
    }
    
    public String get(String key, int timestamp) {
        
        if(!map.containsKey(key)){
         return "";
        }
        TreeMap<Integer, String> neew = map.get(key);
        Integer newtime = neew.floorKey(timestamp);

        if(newtime==null){
            return "";
        
        }

        return neew.get(newtime);


        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */