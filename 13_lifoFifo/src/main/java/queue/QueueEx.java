package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue= new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSNS","홍길동"));
		messageQueue.offer(new Message("sendKakao","홍길동"));
		
		while(!messageQueue.isEmpty()) {
			// 비어있는지 확인한다. 비어있지 않다면 실행
			Message message= messageQueue.poll();
			//큐에서 1개의 메세지 꺼냄
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냈습니다.");
				break;
			case "sendSNS":
				System.out.println(message.to+"님에게 SMS을 보냈습니다.");
				break;
			case "sendKakao":
				System.out.println(message.to+"님에게 카카오톡을 보냈습니다.");
				break;
			}
		}
	}

}
