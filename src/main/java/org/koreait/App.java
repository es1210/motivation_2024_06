package org.koreait;

import java.util.Scanner;

public class App {

    private Scanner sc;
    private String[] motivations;
    private String[] sources;
    private int count;

    public App(Scanner sc) {
        this.sc = sc;
        this.motivations = new String[100]; // 충분히 큰 크기로 초기화
        this.sources = new String[100];     // 충분히 큰 크기로 초기화
        this.count = 0;
    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어 입력 필요");
                continue;
            }

            // add 기능 부분
            if (cmd.equals("add")) {
                System.out.print("motivation : ");
                String motivation = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();
                count++;
                motivations[count - 1] = motivation;
                sources[count - 1] = source;
                System.out.printf("%d번 motivation이 등록 되었습니다\n", count);
            }

            // list 기능 부분
            else if (cmd.equals("list")) {
                printMotivations();
            }
        }
    }



    private void printMotivations() {
        System.out.println(" id   //   motivation   // source");
        for (int i = 0; i < count; i++) {
            System.out.printf("  %d   //   %s   // %s\n", i + 1, motivations[i], sources[i]);
        }
    }
}