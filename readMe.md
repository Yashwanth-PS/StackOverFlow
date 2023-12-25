**Features:**
We will be designing a system with the following requirements:

1) Any non-member (guest) can search and view questions. However, to add or upvote a question, they have to become a member.
2) Members should be able to post new questions.
3) Members should be able to add an answer to an open question.
4) Members can add comments to any question or answer.
5) A member can upvote a question, answer or comment.
6) Members can flag a question, answer or comment, for serious problems or moderator attention.
7) Any member can add a bounty to their question to draw attention.
8) Members will earn badges for being helpful.
9) Members can vote to close a question; Moderators can close or reopen any question.
10) Members can add tags to their questions. A tag is a word or phrase that describes the topic of the question.
11) Members can vote to delete extremely off-topic or very low-quality questions.
12) Moderators can close a question or undelete an already deleted question.

**UserType:**
- Guest 
- Member
- Moderator

**QuestionType:**
- Open
- Close
- Re-Opened
- Deleted
- Un-Deleted

**User:**
- UserType
- Badge

**Question:**
- QuestionType
- Flag
- Bounty
- votes
- votesToClose
- Tag
- voteToDelete
- searchQuestion()
- viewQuestion()
- addQuestion() or postQuestion()
- upvoteQuestion()
- addAnswerToOpenQuestion()
- addCommentToQuestion()
- flagQuestion()
- addBountyToQuestion()
- voteToCloseQuestion()
- closeQuestion()
- reOpenQuestion()
- addTagQuestion()
- voteToDeleteQuestion()
- deleteQuestion()
- unDeleteQuestion()

**Answer:**
- votes
- flags
- addCommentToAnswer()
- upvoteAnswer()
- flagAnswer()

- **Comment:**
- votes
- flags
- upvoteComment()
- flagComment()