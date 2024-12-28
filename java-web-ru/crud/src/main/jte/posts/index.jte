@import exercise.dto.posts.PostsPage;
@param PostsPage post
@param Integer page

 <table class="table table-striped">
    @for(var p : post.getPosts())
        <tr>
             <td>
            	<a href="posts/${p.getId()}">${p.getName()}</a>
        	</td>
 		</tr>
 	@endfor
 </table>
<form>
    <button> <a href="/posts?page=${page-1}"> back</a></button>
    <button> <a href="/posts?page=${page+1}"> next</a></button>
</form>
