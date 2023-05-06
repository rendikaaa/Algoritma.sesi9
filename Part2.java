package TugasSesi9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Queue<String> todolist = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("=========ToDoList============== ");
            System.out.println("1. Masukkan Nama Kegiatan");
            System.out.println("2. Hapus Kegiatan yg paling depan");
            System.out.println("3. Tampilkan daftar Kegiatan");
            System.out.println("4. Keluar");
            System.out.println("Pilih menu (1-4)");

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch(menu){
            case 1:
                System.out.print("Masukkan nama kegiatan: ");
                String todo = scanner.nextLine();
                todolist.add(todo);
                System.out.println("Kegiatan \" " + todo + "\" ditambah kedaftar.");
                break;
            case 2:
                String removedTodo = todolist.poll();
                if(removedTodo == null){
                    System.out.println("Daftar Kegiatan Kosong ");
                }else{
                    System.out.println("Kegiatan \"" + removedTodo + "\" dihapus dari daftar .");

                }
                break;
            case 3:
                if(todolist.isEmpty()){
                    System.out.println("Daftar Kegiatan Kosong ");
                }else{
                    System.out.println("Daftar kegiatan: ");
                    for(String todoItem : todolist){
                        System.out.println("- "+ todoItem);
                    }
                }
                break;
                case 4:
                    System.out.println("Program Selesai. ");
                    System.exit(0);
                default:
                    System.out.println("Pilihan Menu Tidak Valid. ");
                    break;    
            }
        }

    }

    
}

