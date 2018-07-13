package datastructure;

//추상메소드를 임플리먼츠 할때 반드시 오버라이딩 해줘야한다.
public class Book /*implements Comparable*/{
	//저장하고자 하는 항목을 만들고, 접근자 메소드를 만들고, toString을 만든다.
	private String title;
	private String author;
	private String pubdate;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pubdate=" + pubdate + ", price=" + price + "]";
	}
	
//	//크기비교를 하는 메소드
//	@Override
//	public int compareTo(Object o) {
//		Book other = (Book)o;
//		//return this.price-other.price; // 가격 비교는 정수 비교라서 단순한 연산자를 사용 가능
//		//제목 비교는 비교 인터페이스의 메소드를 갖고 크기비교.
//		return this.title.compareTo(other.title);
//	}
}
