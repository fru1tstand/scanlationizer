# Scanlationizer - A Scanlation Release Organizer for groups translating Anime, Manga, Manhwa, etc

### Organize **release**s within a **title** by submitting work **step**s.

 - A **Title** is a piece of work like an anime or manga, but can also be more granular like specific seasons or volumes  
   Eg. `Shield Art Offline S1`, `Unlucky🌙Moon`, etc
 - A **Release** is a published deliverable, like an episode or chapter  
   Eg. `Ep 1`, `Chapter 4`, etc
 - A **Step** is a task within a release that has an internal deliverable  
   Eg. `Upload raw`, `translate`, `qa`, etc

### Customize Scanlationizer to fit your team's operation

 - Create your own **release process**es comprised of custom steps
 - Specify each step's deliverable (eg. a document, a boolean, uploaded files, etc) and a statuses (eg. `not started`,
 `in-progress`, etc)
   - An `Upload Raws` step may be a file upload with `not started`, `partial`, and `complete` statuses
   - A `QA` step may be a doc link with `blocking` and `complete` statuses
 - Each release can specify its own release process, or stick with the project's default

### Your Work, Your Data

Scanlationizer is an offline, standalone, RESTful API host. This means that all data is, by default, stored locally
on the machine that is running it. You will need to provide your own hosting which is as simple as running the software
from your local computer, or as intricate as setting up containerized deployments for the backend, frontend, database,
and media storage.
