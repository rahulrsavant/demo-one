package com.javatpoint.conroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




class Maths{
	int n1,n2,add,sub,mul,div;

	public int getN1() {
		return n1;
	}

	public int getAdd() {
		return add;
	}

	public int getMul() {
		return mul;
	}

	public void setMul(int mul) {
		this.mul = mul;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
}

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@GetMapping("/messege")
	public String getMessage() {

		return "hi this is first program";
	}
	
	@PostMapping("/add_and_sub")	
	public Maths getName(@RequestBody Maths m) {
	 
		m.add= m.n1+m.n2;
		m.sub=m.n1-m.n2;
		m.mul=m.n1*m.n2;
		m.div=m.n1/m.n2;
		return m;
		
		
	}

}
