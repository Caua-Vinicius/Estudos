#include <stdio.h>

// Função para imprimir um vetor
void printArray(int arr[], int tamanho) {
    for (int i = 0; i < tamanho; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// Bubble Sort
void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
}

// Selection Sort
void selectionSort(int arr[], int n) {
    int i, j, minIndex;
    for (i = 0; i < n - 1; i++) {
        minIndex = i;
        for (j = i + 1; j < n; j++)
            if (arr[j] < arr[minIndex])
                minIndex = j;

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

// Insertion Sort
void insertionSort(int arr[], int n) {
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
   
        while (j >= 0 && arr[j] > key) {

            arr[j + 1] = arr[j];
            j = j - 1;

        }
        arr[j + 1] = key;
    }
}

int main() {
    int arr[] = {64, 25, 12, 22, 11, 9};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Array original: ");
    printArray(arr, n);

    // Bubble Sort
    bubbleSort(arr, n);
    printf("Array ordenado pelo Bubble Sort: ");
    printArray(arr, n);

    // volta o array para a versão original
    int arrReset[] = {64, 25, 12, 22, 11, 9};

    // Selection Sort
    selectionSort(arrReset, n);
    printf("Array ordenado pelo Selection Sort: ");
    printArray(arrReset, n);

    // volta o array para a versão original
    int arrReset2[] = {64, 25, 12, 22, 11, 9};

    // Insertion Sort
    insertionSort(arrReset2, n);
    printf("Array ordenado pelo Insertion Sort: ");
    printArray(arrReset2, n);

    return 0;
}
