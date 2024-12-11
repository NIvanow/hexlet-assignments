@import exercise.dto.users.UserPage;
@param UserPage page


@template.layout.page(
    content = @`
        <p>
            <p>${page.getUser().getFirstName()}</p>
            <p>${page.getUser().getLastName()}</p>
        </p>
    `
)