import java.util.Scanner;

public class AppView {
	// 비공개 상수/변수들
	private Scanner _scanner;

	// 생성자
	public AppView() {
		this._scanner = new Scanner(System.in);
	}

	// 공개함수의 구현
	public int inputInt() {
		return Integer.parseInt(this._scanner.nextLine());
	}

	public String inputString() {
		return this._scanner.nextLine();
	}

	public String inputFormula() {
		System.out.print("> 수식을 입력하시오: ");
		return this.inputString();
	}

	public void outputPostfix(String aPostfix) {
		System.out.println("\n[Postfix] " + aPostfix);
	}

	public void outputResult(double aValue) {
		System.out.println("\n[최종값] " + aValue + "\n");
	}

	public void outputMessage(MessageID aMessageID) {
		if (aMessageID == MessageID.Notice_StartProgram)
			System.out.println(" :: 프로그램을 시작합니다. ::");
		else if (aMessageID == MessageID.Notice_StartMenu)
			System.out.println("[수식 입력을 시작합니다.]");
		else if (aMessageID == MessageID.Notice_InfixToPostfix)
			System.out.println("[Infix를 Postfix로]");
		else if (aMessageID == MessageID.Error_Input)
			System.out.println("ERROR: 잘못된 입력입니다.");
		else if (aMessageID == MessageID.Notice_EndMenu)
			System.out.println("[수식 입력을 종료합니다.]");
		else if (aMessageID == MessageID.Notice_EndProgram)
			System.out.println(" :: 프로그램을 종료합니다. ::");
	}

}
