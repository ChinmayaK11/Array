#include <stdio.h>

void rearrange(int arr[], int n) {
    int temp[n];
    int j = 0;

    // First, copy all negative elements
    for (int i = 0; i < n; i++) {
        if (arr[i] < 0) {
            temp[j++] = arr[i];
        }
    }

    // Then, copy all positive elements
    for (int i = 0; i < n; i++) {
        if (arr[i] >= 0) {
            temp[j++] = arr[i];
        }
    }

    // Copy the rearranged array back to the original array
    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
}

int main() {
    int arr[] = {1, -2, 3, -4, 5, -6, 7, -8};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    rearrange(arr, n);

    printf("Rearranged Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
