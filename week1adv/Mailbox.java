package week1adv;

public class Mailbox {
    private Message[] messages;
    private int size;

    // default constructor
    public Mailbox() {
        messages = new Message[3]; // mailbox max size is 10 messages
        size = 0; // default size to 0
    }

    public void addMessage(Message m) {
        if (size < messages.length) {
            messages[size] = m;
            size++;
        } else {
            System.out.println("Mailbox full");
        }
    }

    public Message getMessage(int m) {
        if (m >= 0 && m < size) {
            return messages[m];
        } else {
            System.out.println("Invalid number index.");
            return null;
        }
    }

    public void removeMessage(int remove) {
        if (remove >= 0 && remove < size) {
            for (int j = remove; j < size - 1; j++) {
                messages[j] = messages[j + 1];
            }
            System.out.println("Message Deleted");
            messages[size - 1] = null;
            size--;
        } else {
            System.out.println("Invalid message index.");
        }
    }

    public int mailboxSize() {
        return size;
    }
}
