package com.b2.supercoding_prj01.web.controller.filters;

import com.b2.supercoding_prj01.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequiredArgsConstructor
public class TokenFilter extends OncePerRequestFilter {

    private final JwtTokenProvider jwtTokenProvider;
    private final RedisTemplate<?,?> redisTemplate;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String token = jwtTokenProvider.resolveToken((HttpServletRequest) request);

        try {
            if("logout : "+ token != redisTemplate.opsForValue().get(token)){
                filterChain.doFilter(request, response);
            }
        }catch (Exception e){
            throw new RuntimeException("로그아웃 된 토큰 ");
        }

    }
}
