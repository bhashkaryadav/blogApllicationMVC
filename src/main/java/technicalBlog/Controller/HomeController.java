package technicalBlog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import  technicalBlog.model.Posts;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model){
        ArrayList<Posts> posts = new ArrayList<>();

        Posts post1 = new Posts();
        post1.setTitle("Post 1");
        post1.setBody("Post body 1");
        post1.setDate(new Date());

        Posts post2 = new Posts();
        post2.setTitle("Post 2");
        post2.setBody("Post body 2");
        post2.setDate(new Date());

        Posts post3 = new Posts();
        post3.setTitle("Post 3");
        post3.setBody("Post body 3");
        post3.setDate(new Date());

        Posts post4 = new Posts();
        post4.setTitle("Post 4");
        post4.setBody("Post body 4");
        post4.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);;
        posts.add(post4);
        model.addAttribute("posts",posts);

        return "index";
    }
}
