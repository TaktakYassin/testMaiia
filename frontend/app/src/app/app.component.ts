import { Component } from '@angular/core';
import { PostModel} from "src/app/models/post.model";
import { PostService} from "src/app/services/post.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title ='Technical Test for Maiia'
  url = 'https://jsonplaceholder.typicode.com/posts';
  posts: Array<PostModel> = [];

  constructor(private postService: PostService) {
   }

  ngOnInit() {
      this.postService.getPosts().subscribe((posts: Array<PostModel>) => {
                                         this.posts = posts;
                                       });
    }

}
