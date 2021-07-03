package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Post post = Post.createPost(scanner);
		post.addComment(scanner);
		post.showPost();
		
		scanner.close();

	}

}
