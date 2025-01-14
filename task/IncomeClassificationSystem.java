/* [주석1 : 과제 설명]
객체 지향 프로그래밍 평가과제 (배점 25점)
학과 : 컴퓨터공학전공
학번 : 202104532
이름 : 김응진

과제 주제 : 국민들의 소득수준 분류 및 기초생활 수급자 선정
 */

package task;

import java.io.*;
import java.util.*;
//파일 입출력 및 데이터 처리 메인 클래스
public class IncomeClassificationSystem {
    public static void main(String[] args) {
        // 주석 5 : 참조 타입 (배열 사용-Citizen 객체 배열 생성)
        Citizen[] citizens = {
                new Citizen("Alice", 30, 18000, false),
                new Citizen("Bob", 45, 60000, true),
                new Citizen("Charlie", 25, 25000, false),
                new Citizen("Diana", 60, 15000, true),
                new Citizen("Edward", 50, 40000, false)
        };

        // 주석 6 : 컬렉션 프레임 워크 (배열을 리스트로 변환)
        List<Citizen> citizenList = new ArrayList<>(Arrays.asList(citizens));

        // 주석 3,7 : 예외처리 및 파일 입출력
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("citizen_data.txt"))) {
            for (Citizen citizen : citizenList) {
                //각 시민의 정보를 출력하고 파일에 기록
                System.out.println(citizen);
                writer.write(citizen.toString());
                writer.newLine();
            }
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
