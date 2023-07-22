import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int count;

    Graph(int count) {
        int i;
        this.count = count;


        graph = new ArrayList<ArrayList<Integer>>();

        for(i = 0; i < count; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addConnection(int user1, int user2) {
        graph.get(user1).add(user2);
        graph.get(user2).add(user1);
    }

    void getFriendList(int user) {
        // IMPLEMENT
        int i;
        int n = (graph.get(user)).size();
        int tempFriend;
        boolean userFound = true;

        // Displays error if user is not found
        if(user < 0 || user > count-1) {
            System.out.println("ERROR: User does not exist.");
            userFound = false;
        }

        // Displays user's list of friends if user exists
        if(n > 0 && userFound) {
            System.out.println("Person " + user + " has " + n + " friends!");
            System.out.print("List of friends: ");
            for(i = 0; i < n; i++) {
                tempFriend = (graph.get(user)).get(i);
                System.out.print(tempFriend + " ");
            }
        }
        
    }
}

