@import exercise.dto.posts.PostPage;
@param PostPage page

<h1>${page.getPost().getName()}</h1>
<p>${page.getPost().getBody()}</p>

<form>
    <input type="button" value="back" onclick="history.back()">
 </form>
