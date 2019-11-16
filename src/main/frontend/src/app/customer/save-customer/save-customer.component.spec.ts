import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SaveCustomerComponent } from './save-customer.component';

describe('SaveCustomerComponent', () => {
  let component: SaveCustomerComponent;
  let fixture: ComponentFixture<SaveCustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SaveCustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SaveCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
