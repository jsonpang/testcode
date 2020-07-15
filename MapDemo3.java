import java.security.KeyStore.Entry;
import java.util.*;
public class MapDemo3 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> map = new HashMap<String,String>();
        //给map中添加元素
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
/*         //获取Map中的所有key与value的对应关系
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        System.out.println("entrySet" + entrySet);
        //遍历Set集合
        Iterator<Map.Entry<String,String>> it =entrySet.iterator();
        
        while(it.hasNext()){
            //得到每一对对应关系
            Map.Entry<String,String> entry = it.next();
            //通过每一对对应关系获取对应的key
            String key = entry.getKey();
            //通过每一对对应关系获取对应的value
            String value = entry.getValue();
            System.out.println(key+"="+value); */
            //
            //另一种遍历方式
/*         Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("key:" + key);
            String value = map.get(key);
            System.out.println("value:" + value); */
            
            //通过entrySet 遍历
 /*            Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
            Map.Entry<String, String> entry;
            while (iter.hasNext()) {
                entry = iter.next();
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("value :" + value);

            } */

            //使用for each 的方式遍历
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(map.containsKey("李晨"));
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("value :" + value);

        }

        
    }
}
