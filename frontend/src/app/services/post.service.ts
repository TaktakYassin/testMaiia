import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {PostModel} from "../models/post.model";
import {environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  private serverURL = environment.serverURL;

  constructor(private http: HttpClient) {
  }

  public getPosts(): Observable<Array<PostModel>> {
    return this.http.get<Array<PostModel>>(this.serverURL + '/posts/');
  }

}
