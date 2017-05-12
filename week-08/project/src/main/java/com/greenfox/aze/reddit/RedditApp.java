package com.greenfox.aze.reddit;

import com.greenfox.aze.reddit.model.Post;
import com.greenfox.aze.reddit.services.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApp implements CommandLineRunner{

	@Autowired
	RedditPostRepository redditPostRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		redditPostRepository.save(new Post ("title", "href"));
		redditPostRepository.save(new Post ("title", "href"));
		redditPostRepository.save(new Post ("title", "href"));



	}
}
