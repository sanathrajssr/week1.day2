package Assignmentweek1.day2;

class Mobile {
	public void sendMessage() {
		String sendMessage="Hiii How are you";
		System.out.println("SendMessage:"+sendMessage);
	}
	public void shareDocument() {
		String pdfDocument="MicrosoftWord";
		System.out.println("pdfDocument:"+pdfDocument);
	}
	public void call() {
		String callFriend="Vijay";
		System.out.println("Call Friend:"+callFriend);
	}
	public static void main(String[] args) {
		Mobile calling=new Mobile();
		calling.sendMessage();
	}
}
