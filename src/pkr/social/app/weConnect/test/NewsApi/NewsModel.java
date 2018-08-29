package pkr.social.app.weConnect.test.NewsApi;

public class NewsModel {

	
	private String publishedAt;
	private String author;
	private String urlToImage;
	private String description;
	private String title;
	private String url;
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getUrlToImage() {
		return urlToImage;
	}
	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "NewsModel [publishedAt=" + publishedAt + ", author=" + author + ", urlToImage=" + urlToImage
				+ ", description=" + description + ", title=" + title + ", url=" + url + "]";
	}
	
	
}
