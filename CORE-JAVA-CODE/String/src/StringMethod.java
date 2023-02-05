
public class StringMethod {

	public static void main(String[] args) {
		System.out.println("Output 1");
		//Creating a string using new keyword of string class
		String str=new String ("sachin");
		System.out.println(str);
		
		System.out.println("Output 2");
		//char
		char [] ch = {'m','e','i','n','u'};
		String s =new String(ch);
		System.out.println(s);
		
		
		/*byte
		byte [] b= {10,20,30,40,50};
		String a =new String(b);
		System.out.println(a);*/
		
		System.out.println("Output 3");
		//chatAt use to see char at particular index using index number
		String c=new String ("sachin");
		System.out.println(c.charAt(3));
		
		
		System.out.println("Output 4");
		String d=new String("sachin");
		d.concat("tendulkar");
		System.out.println(d);
		
		System.out.println("Output 5");
		String e="sachin";
		System.out.println(e.equals("sachin"));
	
	
		System.out.println("Output 6");
		String f="sachin";
		System.out.println(f.equalsIgnoreCase("SACHIN"));
		
		
		System.out.println("Output 7");
		String g="sachinHello";
		System.out.println(g.substring(6));
		System.out.println(g.substring(5,7));
		
		
		System.out.println("Output 8"); 
		String h="sachinHello";
		System.out.println(h.length());
		
		System.out.println("Output 9");
		String i="sbchinHello";
		System.out.println(i.replace('b','a'));
		
		System.out.println("Output 10");
		String j="sachinhello";
		System.out.println(j.toUpperCase());
		
		System.out.println("Output 11");
		String k="sachinhello";
		System.out.println(k.toLowerCase());
		
		System.out.println("Output 12");
		String l="  karnataka  ";
		System.out.println(l.length());
		System.out.println(l.trim());
		System.out.println(l);
		
		
		
		System.out.println("Output 13");
		String m="sachinhello";
		System.out.println(m.indexOf('n'));
		
		System.out.println("Output 14");
		String n="sachinhello";
		System.out.println(n.lastIndexOf('l'));
		
		System.out.println("Output 15");
		String o="meinuddin";
		System.out.println(o.toString());
		
		System.out.println("Output 16");
		StringBuffer p=new StringBuffer();
		p.append("Ayanmkjihugyftdyyr");
		System.out.println(p.capacity());
		System.out.println(p.length());
		
		
		
		System.out.println("Output 17");
		StringBuffer q= new StringBuffer();
		q.append("The value of pi is:");
		q.append("3.1414");
		q.append("This is exactly ");
		q.append("true");
		System.out.println(q);
		
		
		
		
		System.out.println("Output 18");
		StringBuffer r= new StringBuffer("abcdefgh");
		r.insert(2,"xyz");
		r.insert(9,11);
		r.insert(r.length(),"dhoni");
		System.out.println(r);
		
		
		
		System.out.println("Output 19");
		StringBuffer t= new StringBuffer("sachinrameshTtendulkar");
		System.out.println(t);
		t.delete(6, 12);
		t.deleteCharAt(7);
		System.out.println(t);
		
		
		

		System.out.println("Output 20");
		StringBuffer u= new StringBuffer("sachintendulkar");
		System.out.println(u);
		u.reverse();
		System.out.println(u);
			
		
		

		System.out.println("Output 21");
		StringBuffer v= new StringBuffer("sachintendulkar");
		System.out.println(v);
		v.setLength(6);
		System.out.println(v);
		
		
		System.out.println("Output 22");
		StringBuffer w= new StringBuffer(1000);
		System.out.println(w.capacity());
		w.append("sachin");
		w.trimToSize();
		System.out.println(w.capacity());
		
		
		//method chaining
		System.out.println("Output 23");
		StringBuffer x= new StringBuffer("virat");
		x.append("kholi").insert(10,"anushka").reverse().append("IND").insert(x.length(),"RCB").reverse();
		System.out.println(x);
		
		
		
		
		
		
		
		
	}

}
