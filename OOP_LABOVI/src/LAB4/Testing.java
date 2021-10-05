// OOP LAB 4 1/5 - Antonio Zubcic
package LAB4;

import java.util.ArrayList;
import java.util.List;

public class Testing {

    public static void main(String[] args) {

        ArrayList<Server> servers = new ArrayList<>();
        Virtual_Server vs = new Virtual_Server();
        servers.add(vs);
        Linux_Server ls = new Linux_Server();
        servers.add(ls);
        Windows_Server ws = new Windows_Server();
        servers.add(ws);

        String url = "conn:@dbs:1800:se";
        String usr = "user_007";
        String password = "5697845068409";
        establishConnection(servers, url, usr, password);
        System.out.println("******************************************************");
        closeConnection(servers, url, usr);
    }

    public static void establishConnection(List<Server> servers, String url, String usr, String password) {
        for (Server s : servers) {
            s.establish_connection(url, usr, password);
        }
    }


    public static void closeConnection(List<Server> servers, String url, String usr) {
        for (Server s : servers) {
            s.close_connection(url, usr);
        }

    }
}