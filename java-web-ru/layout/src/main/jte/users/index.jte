@import exercise.dto.users.UsersPage;
@param UsersPage page

@template.layout.page(
    content = @`
        <a href="/users/build">New User</a>
        @for(var user : page.getUsers())
        	<p>
        		${user.getFirstName()}
        		${user.getLastName()}
        	</p>
        @endfor
    `
)