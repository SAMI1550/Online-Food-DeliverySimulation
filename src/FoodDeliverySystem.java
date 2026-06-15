import java.util.*;

class Order {
    int orderId;
    String customerName;
    String foodItem;
    int destination;

    public Order(int orderId, String customerName,
                 String foodItem, int destination) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.destination = destination;
    }

    public String toString() {
        return "Order ID: " + orderId +
                ", Customer: " + customerName +
                ", Food: " + foodItem +
                ", Location: " + destination;
    }
}

public class FoodDeliverySystem {

    static final int V = 6;

    Queue<Order> orderQueue = new LinkedList<>();

    int[][] graph = {
            {0, 4, 2, 0, 0, 0},
            {4, 0, 1, 5, 0, 0},
            {2, 1, 0, 8, 10, 0},
            {0, 5, 8, 0, 2, 6},
            {0, 0, 10, 2, 0, 3},
            {0, 0, 0, 6, 3, 0}
    };

    int minDistance(int[] dist, boolean[] visited) {

        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < V; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                index = i;
            }
        }
        return index;
    }

    void dijkstra(int source) {

        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {

                if (!visited[v]
                        && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("\nShortest Paths From Restaurant:");

        for (int i = 0; i < V; i++) {
            System.out.println(
                    "Location " + i +
                            " -> Distance = " + dist[i] + " km");
        }
    }

    void addOrder(Order order) {
        orderQueue.offer(order);
        System.out.println("Order Added Successfully.");
    }

    void viewOrders() {

        if (orderQueue.isEmpty()) {
            System.out.println("No Orders Available.");
            return;
        }

        System.out.println("\nCurrent Orders:");

        for (Order o : orderQueue) {
            System.out.println(o);
        }
    }

    void processOrder() {

        if (orderQueue.isEmpty()) {
            System.out.println("No Orders To Deliver.");
            return;
        }

        Order order = orderQueue.poll();

        System.out.println("\nDelivering Order...");
        System.out.println(order);

        System.out.println("Delivery Completed.");
    }

    void trackOrders() {

        if (orderQueue.isEmpty()) {
            System.out.println("All Orders Delivered.");
            return;
        }

        System.out.println("\nPending Orders:");

        for (Order o : orderQueue) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        FoodDeliverySystem system =
                new FoodDeliverySystem();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== FOOD DELIVERY SYSTEM =====");
            System.out.println("1. Add Order");
            System.out.println("2. View Orders");
            System.out.println("3. Process Order");
            System.out.println("4. Delivery Tracking");
            System.out.println("5. Shortest Delivery Path");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Order ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Food Item: ");
                    String food = sc.nextLine();

                    System.out.print("Destination (0-5): ");
                    int dest = sc.nextInt();

                    system.addOrder(
                            new Order(id, name, food, dest));

                    break;

                case 2:
                    system.viewOrders();
                    break;

                case 3:
                    system.processOrder();
                    break;

                case 4:
                    system.trackOrders();
                    break;

                case 5:
                    system.dijkstra(0);
                    break;

                case 6:
                    System.out.println("System Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}