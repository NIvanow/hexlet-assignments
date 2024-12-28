package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;

import exercise.dto.posts.PostsPage;
import exercise.dto.posts.PostPage;
import exercise.repository.PostRepository;

import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class PostsController {

    // BEGIN
    public static void showPost(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var pag = PostRepository.find(id)
                .orElseThrow(() -> new NotFoundResponse("Page not found"));
        //ctx.status(404);
        var page = new PostPage(pag);
        ctx.render("posts/show.jte", model("page", page));
    }

    public static void index(Context ctx) {
        int page = ctx.queryParamAsClass("page",
                Integer.class).getOrDefault(1);
        var posts = PostRepository.findAll(page,5);
        var post = new PostsPage(posts);
        ctx.attribute("page", page);
        ctx.render("posts/index.jte", model("post", post, "page", page));
    }
    // END
}
