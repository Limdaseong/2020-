package level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return tilte;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setWriteId(int writeId) {
		this.writeId =writeId;
	}
}
