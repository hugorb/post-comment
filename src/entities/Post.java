package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Post {
	
	private String title;
	private String content;
	private Date moment;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();

	public Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.moment = new Date();
		this.likes = 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMoment() {
		return moment;
	}

	public Integer getLikes() {
		return likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public static Post createPost(Scanner scanner) {
		System.out.println("Criando um novo post:");
		System.out.print("Titulo: ");
		String title = scanner.nextLine();
		System.out.print("Conteudo: ");
		String content = scanner.nextLine();
		Post post = new Post(title, content);
		return post;
	}
	
	public void addComment(Scanner scanner) {
		System.out.println();
		System.out.print("Comente aqui: ");
		String typedComment = scanner.nextLine();
		Comment comment = new Comment(typedComment);
		comments.add(comment);
	}
	
	public void addLike() {
		likes ++;
		System.out.println("Like adicionado com sucesso!");
	}
	
	public void showPost() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		System.out.println();
		System.out.println("*********POST*********");
		System.out.println();
		
		System.out.println(title);
		System.out.println(likes + " likes - " + sdf.format(moment));
		System.out.println(content);
		System.out.println("Comments: ");
		for (Comment comment : comments) {
			System.out.println(comment.getComment());
		}
		
		System.out.println();
		System.out.println("**********************");
		System.out.println();
	}
	
	

}
