package blogpost;

import java.util.Date;

public class BlogPost {
  /*Create a BlogPost class that has
      an authorName
      a title
      a text
      a publicationDate
      Create a few blog post objects:
      "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
  Lorem ipsum dolor sit amet.
"Wait but why" titled by  posted at "2010.10.10."
  A popular long-form, stick-figure-illustrated blog about almost everything.
"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
  Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.*/

  private String authorName;
  private String title;
  private String text;
  private String publicationdate;

  public BlogPost(String authorName, String title, String text, String publicationdate) {
    this.authorName = authorName;
    this.title = title;
    this.publicationdate = publicationdate;
    this.text = text;
  }
}
