package frame;

import java.util.LinkedHashMap;
import java.util.Map;

public class CityMap {

    public static Map<String, String[]> model = new LinkedHashMap();

    static {
        model.put("北京" ,new String[]{"北京"});
        model.put("上海",new String[]{"上海"});
        model.put("天津",new String[]{"天津"});
        model.put("重庆",new String[]{"重庆"});
        model.put("黑龙江",new String[]{"哈尔滨","齐齐哈尔","牡丹江","大庆"});
        model.put("吉林",new String[]{"长春","延边","吉林"});
        model.put("辽宁",new String[]{"沈阳","大连","葫芦岛"});
    }
}
