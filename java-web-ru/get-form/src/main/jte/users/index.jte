@import exercise.dto.users.UsersPage;
@param UsersPage page

<form action="/users" method="get">
<input type="search" name="term" value="${page.getTerm()}" />
<input type="submit" value="Search" />
</form>
@template.layout.page(
    content = @`
        @for(var user : page.getUsers())
        	<p>
        		${user.getFirstName()}
        		${user.getLastName()}
        	</p>
        @endfor
    `
)