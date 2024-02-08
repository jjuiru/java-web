package sec01.egxem07.pack2;

import sec01.egxem07.pack1.A;

public class D extends A { //자식 클래스의 경우 사용가능
	public D() {
		super(); //부모의 생성자 A()
		this.field = "value";  //super this 전부 사용가능
		this.method();
	}

	public void method() {
		this.field = "value";
		this.method();
	}
}
