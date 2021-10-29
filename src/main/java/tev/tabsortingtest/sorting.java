package tev.tabsortingtest;

import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.shared.TAB;
import me.neznamy.tab.shared.permission.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.*;

public class sorting {
    public static void sorting(){
        HashMap<Player, Integer> allplayers = new HashMap<>();
        for (Player p: Bukkit.getOnlinePlayers()){
            if(Main.getPlugin(Main.class).nickedplayers.contains(p)){
                allplayers.put(p, 10);
            }else if(p.hasPermission("weight.100")){
                allplayers.put(p, 100);
            }else if(p.hasPermission("weight.70")){
                allplayers.put(p, 70);
            }else if(p.hasPermission("weight.55")){
                allplayers.put(p, 55);
            }else if(p.hasPermission("weight.52")){
                allplayers.put(p, 52);
            }else if(p.hasPermission("weight.50")){
                allplayers.put(p, 50);
            }else if(p.hasPermission("weight.49")){
                allplayers.put(p, 49);
            }else if(p.hasPermission("weight.14")){
                allplayers.put(p, 14);
            }else if(p.hasPermission("weight.13")){
                allplayers.put(p, 13);
            }else if(p.hasPermission("weight.12")){
                allplayers.put(p, 12);
            }else if(p.hasPermission("weight.11")){
                allplayers.put(p, 11);
            }else if(p.hasPermission("weight.10")){
                allplayers.put(p, 10);
            }
        }
            System.out.println(allplayers);
            System.out.println("-----------------");
            Map<Player, Integer> sortedplayers = sortByValue(allplayers);
            System.out.println(sortedplayers);
            System.out.println("-----------------");
            List<TabPlayer> sortedplayersinlist = new ArrayList();
        for (Player po: sortedplayers.keySet()) {
            //TabPlayer poo = TAB.getInstance().getPlayer(po.getUniqueId());
            //sortedplayersinlist.add(poo);
        }
            System.out.println(sortedplayersinlist);
            System.out.println("-----------------");
            //sortedplayersinlist.forEach((pp) -> TAB.getInstance().removePlayer(pp));
            //sortedplayersinlist.forEach((pl) -> TAB.getInstance().addPlayer(pl));

        }
    public static HashMap<Player, Integer> sortByValue(HashMap<Player, Integer> hm)
    {
        List<Map.Entry<Player, Integer> > list =
                new LinkedList<Map.Entry<Player, Integer> >(hm.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<Player, Integer> >() {
            public int compare(Map.Entry<Player, Integer> o1,
                               Map.Entry<Player, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Player, Integer> temp = new LinkedHashMap<Player, Integer>();
        for (Map.Entry<Player, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    }

