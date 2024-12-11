@import exercise.dto.users.UserPage;
@param UserPage page
  </html>
	<body>
      <main>
            <a href="/users">Пользователь</a>
            <p>${page.getUser().getId()}</p>
            <p>${page.getUser().getFirstName()}</p>
            <p>${page.getUser().getLastName()}</p>
            <p>${page.getUser().getEmail()}</p>
      </main>
	</body>
</html>