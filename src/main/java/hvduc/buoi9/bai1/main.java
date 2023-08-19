package hvduc.buoi9.bai1;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        hocsinh hs = new hocsinh(1, "Nam", "034121", "4");
        hocsinh hs1 = new hocsinh(2, "Nu", "03431121", "9");
        ArrayList<hocsinh> listStudent = new ArrayList<>();
        listStudent.add(hs);
        listStudent.add(hs1);
        Logger.log(listStudent.toString());
        Logger.read();

        //Xóa file
//        logger.deleteFile();

    }
}

