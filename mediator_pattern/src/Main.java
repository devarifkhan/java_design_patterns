//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "সাবস্ক্রাইবার ১");
        User user2 = new ChatUser(chatRoom, "সাবস্ক্রাইবার ২");
        User user3 = new ChatUser(chatRoom, "সাবস্ক্রাইবার ৩");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("হ্যালো, সবাইকে!");
        user2.sendMessage("হ্যালো! কেমন আছো?");
    }
}