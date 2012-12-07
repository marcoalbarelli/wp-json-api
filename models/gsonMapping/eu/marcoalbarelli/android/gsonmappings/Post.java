package eu.marcoalbarelli.android.gsonmappings;

import java.util.Date;

import android.nfc.Tag;


public class Post {
	
	public int id;
	public String type;
	public String slug;
	public String url;
	public String status;
	public String title;
	public String titel_plain;
	public String content;
	public String excerpt;
	public Date date;
	public Date modified;
	public Category[] categories;
	public Tag[] tags;
	public Author author;
	public Comment[] comments;
	public Attachment[] attachments;
	public int comment_count;
	public String comment_status;
	
	
/**
 * {
      "id": 1,
      "type": "post",
      "slug": "hello-world",
      "url": "http:\/\/wp\/2012\/11\/25\/hello-world\/",
      "status": "publish",
      "title": "Hello world!",
      "title_plain": "Hello world!",
      "content": "<p>Welcome to <a href=\"http:\/\/wp\/\">Wp<\/a>. This is your first post. Edit or delete it, then start blogging!<\/p>",
      "excerpt": "Welcome to Wp. This is your first post. Edit or delete it, then start blogging!",
      "date": "2012-11-25 09:46:05",
      "modified": "2012-11-25 09:46:05",
      "categories": [],
      "tags": [],
      "author": {
        "id": 1,
        "slug": "admin",
        "name": "admin",
        "first_name": "",
        "last_name": "",
        "nickname": "admin",
        "url": "",
        "description": ""
      },
      "comments": [
        
      ],
      "attachments": [],
      "comment_count": 1,
      "comment_status": "open"
    }
 * 
 */
}
