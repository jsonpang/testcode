import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> map = new HashMap<String,String>();
        //给map中添加元素
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        //获取Map中的所有key
        Set<String> keySet = map.keySet();
        //遍历存放所有key的Set集合
        Iterator<String> it =keySet.iterator();    
        while(it.hasNext()){                         //利用了Iterator迭代器**
            //得到每一个key
            String key = it.next();
            //通过key获取对应的value
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}