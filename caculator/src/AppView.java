import java.util.Scanner;

public class AppView {
	// ����� ���/������
	private Scanner _scanner;

	// ������
	public AppView() {
		this._scanner = new Scanner(System.in);
	}

	// �����Լ��� ����
	public int inputInt() {
		return Integer.parseInt(this._scanner.nextLine());
	}

	public String inputString() {
		return this._scanner.nextLine();
	}

	public String inputFormula() {
		System.out.print("> ������ �Է��Ͻÿ�: ");
		return this.inputString();
	}

	public void outputPostfix(String aPostfix) {
		System.out.println("\n[Postfix] " + aPostfix);
	}

	public void outputResult(double aValue) {
		System.out.println("\n[������] " + aValue + "\n");
	}

	public void outputMessage(MessageID aMessageID) {
		if (aMessageID == MessageID.Notice_StartProgram)
			System.out.println(" :: ���α׷��� �����մϴ�. ::");
		else if (aMessageID == MessageID.Notice_StartMenu)
			System.out.println("[���� �Է��� �����մϴ�.]");
		else if (aMessageID == MessageID.Notice_InfixToPostfix)
			System.out.println("[Infix�� Postfix��]");
		else if (aMessageID == MessageID.Error_Input)
			System.out.println("ERROR: �߸��� �Է��Դϴ�.");
		else if (aMessageID == MessageID.Notice_EndMenu)
			System.out.println("[���� �Է��� �����մϴ�.]");
		else if (aMessageID == MessageID.Notice_EndProgram)
			System.out.println(" :: ���α׷��� �����մϴ�. ::");
	}

}
