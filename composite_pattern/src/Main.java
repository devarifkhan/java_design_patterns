//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FileComponent file1 = new File("Resume.docx");
        FileComponent file2 = new File("CoverLetter.docx");
        Folder folder = new Folder("Job Applications");

        folder.add(file1);
        folder.add(file2);

        // একটি নতুন ফোল্ডার তৈরি
        Folder mainFolder = new Folder("Documents");
        mainFolder.add(folder);
        mainFolder.add(new File("Notes.txt"));

        // ফাইল সিস্টেমের বিবরণ প্রদর্শন
        mainFolder.showDetails();
    }
}
