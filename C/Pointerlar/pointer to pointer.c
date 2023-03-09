//pointerTopointer
	
	int kullaniciSayisi=123;
	int *ptr=&kullaniciSayisi;
	int **ptr2ptr=&ptr;
	
	printf("%d\n",kullaniciSayisi);
	printf("%d\n",*ptr);
	printf("%d\n",**ptr2ptr);
	
	
				ptr2ptr  ----->>>           ptr    ---->>>        kullaniciSayisi
																	
	DEÐERLER:   #A12345				            #A1234			    			123
	ADRES:		#A123456						#A12345							#A1234
				*#A12345=#A1234						    	*A1234=123
				*#A1234=123
	
	
	int **ikiBoyutluDizi;
	int satirSayisi,sutunSayisi;
	int i,j;
	srand(time(NULL));
	printf("Satir sayisi:");
	scanf("%d",&satirSayisi);
	printf("Sutun sayisi:");
	scanf("%d",&sutunSayisi);
	
