package Robot.Test;

import java.util.Map;

public class MapList {

    Map<String, Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void print() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
