#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Node {
    int USN, sem;
    char name[50];    // Fixed-size arrays instead of pointers
    char program[50]; // Fixed-size arrays instead of pointers
    struct Node *next;
};

struct Node *head = NULL, *temp = NULL, *p;
int size = 0;

void createSLL() {
    temp = (struct Node*)malloc(sizeof(struct Node));
    if (temp == NULL) {
        printf("\nMemory allocation failed!");
        return;
    }
    
    printf("Enter USN: ");
    scanf("%d", &temp->USN);
    printf("Enter Name: ");
    scanf("%s", temp->name);
    printf("Enter Programme: ");
    scanf("%s", temp->program);
    printf("Enter Sem: ");
    scanf("%d", &temp->sem);
    
    temp->next = NULL;
    head = temp;
    size++;
    
    printf("\nEntered Data: Student %d\nUSN = %d\nName = %s\nProgramme = %s\nSem = %d", 
           size, head->USN, head->name, head->program, head->sem);
}

void display() {
    if(size == 0) {
        printf("\nNo Data");
        return;
    }
    printf("\nTotal Number of Students: %d", size);
    temp = head;
    for(int i = 0; i < size; i++) {
        printf("\nStudent %d: \nUSN = %d\nName = %s\nProgramme = %s\nSem = %d", 
               i+1, temp->USN, temp->name, temp->program, temp->sem);
        temp = temp->next;
    }
}

void insertAtEnd() {
    if(head == NULL) {
        printf("\nList Does not Exist. Creating new list.");
        createSLL();
        return;
    }
    
    temp = (struct Node*)malloc(sizeof(struct Node));
    if (temp == NULL) {
        printf("\nMemory allocation failed!");
        return;
    }
    
    printf("\nEnter the Data for Student %d:", size + 1);
    printf("\nEnter USN: ");
    scanf("%d", &temp->USN);
    printf("Enter Name: ");
    scanf("%s", temp->name);
    printf("Enter Programme: ");
    scanf("%s", temp->program);
    printf("Enter Sem: ");
    scanf("%d", &temp->sem);
    
    temp->next = NULL;
    
    if(head == NULL) {
        head = temp;
    } else {
        p = head;
        while(p->next != NULL) {
            p = p->next;
        }
        p->next = temp;
    }
    size++;
    
    printf("\nEntered Data: Student %d\nUSN = %d\nName = %s\nProgramme = %s\nSem = %d", 
           size, temp->USN, temp->name, temp->program, temp->sem);
}

void deleteEnd() {
    if(head == NULL) {
        printf("\nList Does not Exist");
        return;
    }
    
    if(head->next == NULL) {
        printf("\nDeleted Data: Student %d\nUSN = %d\nName = %s\nProgramme = %s\nSem = %d", 
               size, head->USN, head->name, head->program, head->sem);
        free(head);
        head = NULL;
        size--;
        return;
    }
    
    p = head;
    while(p->next->next != NULL) {
        p = p->next;
    }
    
    printf("\nDeleted Data: Student %d\nUSN = %d\nName = %s\nProgramme = %s\nSem = %d", 
           size, p->next->USN, p->next->name, p->next->program, p->next->sem);
    free(p->next);
    p->next = NULL;
    size--;
}

void insertAtHead() {
    temp = (struct Node*)malloc(sizeof(struct Node));
    if (temp == NULL) {
        printf("\nMemory allocation failed!");
        return;
    }
    
    printf("\nEnter the Data for Student 1:");
    printf("\nEnter USN: ");
    scanf("%d", &temp->USN);
    printf("Enter Name: ");
    scanf("%s", temp->name);
    printf("Enter Programme: ");
    scanf("%s", temp->program);
    printf("Enter Sem: ");
    scanf("%d", &temp->sem);
    
    temp->next = head;
    head = temp;
    size++;
    
    printf("\nEntered Data: Student 1\nUSN = %d\nName = %s\nProgramme = %s\nSem = %d",
           temp->USN, temp->name, temp->program, temp->sem);
}

void deleteHead() {
    if(head == NULL) {
        printf("\nList Does not Exist");
        return;
    }
    
    temp = head;
    printf("\nDeleted Data: Student 1\nUSN = %d\nName = %s\nProgramme = %s\nSem = %d",
           temp->USN, temp->name, temp->program, temp->sem);
    head = head->next;
    free(temp);
    size--;
}

int main() {
    printf("\n1. CreateSLL of Students");
    printf("\n2. Display");
    printf("\n3. Insert at End");
    printf("\n4. Delete End");
    printf("\n5. Insert at Head");
    printf("\n6. Delete Head");
    printf("\n7. Exit");
    
    int ch;
    do {
        printf("\nEnter Your Choice: ");
        scanf("%d", &ch);
        switch(ch) {
            case 1: createSLL();
                    break;
            case 2: display();
                    break;
            case 3: insertAtEnd();
                    break;
            case 4: deleteEnd();
                    break;
            case 5: insertAtHead();
                    break;
            case 6: deleteHead();
                    break;
            case 7: exit(0);
                    break;
            default: printf("\nInvalid Choice");
        }
    } while(ch != 7);
    
    return 0;
}