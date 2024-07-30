import { TestBed } from '@angular/core/testing';

import { BookstoreFormService } from './boostore-form.service';

describe('BookstoreFormService', () => {
  let service: BookstoreFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BookstoreFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
